// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package communitycommons.actions;

import com.mendix.systemwideinterfaces.core.IMendixObject;
import communitycommons.Misc;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * Identical to executeMicroflowAsUser, but takes 1 argument
 */
public class executeMicroflowAsUser_1 extends CustomJavaAction<java.lang.String>
{
	private final java.lang.String microflow;
	private final java.lang.String username;
	private final java.lang.Boolean sudoContext;
	private final java.lang.String arg1name;
	private final IMendixObject arg1value;

	public executeMicroflowAsUser_1(
		IContext context,
		java.lang.String _microflow,
		java.lang.String _username,
		java.lang.Boolean _sudoContext,
		java.lang.String _arg1name,
		IMendixObject _arg1value
	)
	{
		super(context);
		this.microflow = _microflow;
		this.username = _username;
		this.sudoContext = _sudoContext;
		this.arg1name = _arg1name;
		this.arg1value = _arg1value;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		Object res = Misc.executeMicroflowAsUser(getContext(), microflow, username, sudoContext, arg1name, arg1value);
		return res == null ? null : res.toString();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "executeMicroflowAsUser_1";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
