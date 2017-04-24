package hu.bme.simonyi.dave.rmbackend.util;

import com.sun.org.apache.xpath.internal.operations.Bool;
import hu.bme.simonyi.dave.rmbackend.model.RequestStatus;
import hu.bme.simonyi.dave.rmbackend.repository.RequestStatusRepository;
import hu.bme.simonyi.dave.rmbackend.service.RequestStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by dkiss on 2017. 04. 10..
 */
@Component
public class RequestStatusGetter {

    @Autowired
    RequestStatusService requestStatusService;

    public static final String NEW_STR = "Új (nem elfogadott)";
    public static final String APPROVED_STR = "Elfogadott";
    public static final String DECLINED_STR = "Elutasított";
    public static final String UPDATED_STR = "Módosított";
    public static final String CANCELLED_STR = "Visszavont";
    public static final String ARCHIVED_STR = "Archivált";
    public static final String DELETED_STR = "Törölt";

    public RequestStatusGetter() {

    }

    public RequestStatus getNew() {
        if (!requestStatusService.isRequestStatusExists(NEW_STR)) {
            RequestStatus requestStatus = new RequestStatus();
            requestStatus.setRequestStatusID(null);
            requestStatus.setName(NEW_STR);
            requestStatus.setDescription("Beérkezett, de még nem elfogadott igénylés");
            return requestStatusService.createRequestStatus(requestStatus);
        } else {
            return requestStatusService.getRequestStatus(NEW_STR);
        }
    }

    public RequestStatus getApproved() {
        if (!requestStatusService.isRequestStatusExists(APPROVED_STR)) {
            RequestStatus requestStatus = new RequestStatus();
            requestStatus.setRequestStatusID(null);
            requestStatus.setName(APPROVED_STR);
            requestStatus.setDescription("Elfogadott igénylés");
            return requestStatusService.createRequestStatus(requestStatus);
        } else {
            return requestStatusService.getRequestStatus(APPROVED_STR);
        }
    }

    public RequestStatus getDeclined() {
        if (!requestStatusService.isRequestStatusExists(DECLINED_STR)) {
            RequestStatus requestStatus = new RequestStatus();
            requestStatus.setRequestStatusID(null);
            requestStatus.setName(DECLINED_STR);
            requestStatus.setDescription("Elutasított igénylés");
            return requestStatusService.createRequestStatus(requestStatus);
        } else {
            return requestStatusService.getRequestStatus(DECLINED_STR);
        }
    }

    public RequestStatus getUpdated() {
        if (!requestStatusService.isRequestStatusExists(UPDATED_STR)) {
            RequestStatus requestStatus = new RequestStatus();
            requestStatus.setRequestStatusID(null);
            requestStatus.setName(UPDATED_STR);
            requestStatus.setDescription("Módosított, de még nem elfogadott igénylés");
            return requestStatusService.createRequestStatus(requestStatus);
        } else {
            return requestStatusService.getRequestStatus(UPDATED_STR);
        }
    }
}
