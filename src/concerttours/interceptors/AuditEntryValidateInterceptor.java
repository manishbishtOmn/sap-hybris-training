package concerttours.interceptors;

import com.microsoft.sqlserver.jdbc.StringUtils;
import concerttours.model.UserAuditEntryModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;

public class AuditEntryValidateInterceptor implements ValidateInterceptor
{
    @Override
    public void onValidate(final Object o, final InterceptorContext ctx) throws InterceptorException
    {
        if (o instanceof UserAuditEntryModel)
        {
            final UserAuditEntryModel auditEntry = (UserAuditEntryModel) o;
            if (StringUtils.isEmpty(auditEntry.getName()))
            {
                throw new InterceptorException("User audit entries cannot have empty username");
            }
        }
    }
}