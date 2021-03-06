package asyncrr.ajax;

import com.webobjects.appserver.*;
import com.webobjects.appserver._private.WOComponentRequestHandler;

import er.extensions.appserver.ajax.ERXAjaxApplication;

public class AjaxPTRequestHandler extends WOComponentRequestHandler {

	public static final String AjaxRequestHandlerKey = "ajax";
	private static boolean _useAjaxRequestHandler = false;

	public AjaxPTRequestHandler() {
		AjaxPTRequestHandler.setUseAjaxRequestHandler(true);
	}

	@Override
	public WOResponse handleRequest(WORequest request) {
		ERXAjaxApplication.enableShouldNotStorePage();
		WOResponse response = super.handleRequest(request);
		return response;
	}

	public static void setUseAjaxRequestHandler(boolean useAjaxRequestHandler) {
		_useAjaxRequestHandler = useAjaxRequestHandler;
	}

	public static boolean useAjaxRequestHandler() {
		return _useAjaxRequestHandler;
	}
}
