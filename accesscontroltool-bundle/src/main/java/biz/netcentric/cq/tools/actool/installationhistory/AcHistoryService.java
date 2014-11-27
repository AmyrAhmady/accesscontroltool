package biz.netcentric.cq.tools.actool.installationhistory;

import javax.jcr.Session;

public interface AcHistoryService {

    public void persistHistory(AcInstallationHistoryPojo history,
            final String configurationRootPath);

    public void persistAcePurgeHistory(AcInstallationHistoryPojo history);

    public String[] getInstallationLogPaths();

    public String getLogHtml(Session session, String path);

    public String getLogTxt(Session session, String path);

    public String getLastInstallationHistory();

    public String showHistory(int n);

}
