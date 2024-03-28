package concerttours.interceptors;

import concerttours.model.UserAuditEntryModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PersistenceOperation;
import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;
import java.util.Date;

public class AuditingUserRemoveInterceptor implements RemoveInterceptor
{
    @Override
    public void onRemove(final Object o, final InterceptorContext ctx) throws InterceptorException
    {
        if (o instanceof UserModel)
        {
            final UserModel user = (UserModel) o;
            final UserAuditEntryModel auditEntryModel = ctx.getModelService().create(UserAuditEntryModel.class);
            auditEntryModel.setChangeTimestamp(new Date());
            auditEntryModel.setDisplayName(user.getDisplayName());
            auditEntryModel.setName(user.getName());
            auditEntryModel.setUid(user.getUid());
            ctx.registerElementFor(auditEntryModel, PersistenceOperation.SAVE);
        }
    }
}