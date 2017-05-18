using System;
using Gtk;

public partial class MainWindow: Gtk.Window
{	
	public MainWindow (): base (Gtk.WindowType.Toplevel)
	{
		Build ();
		labelSaludo.Text = "Hola. Pon tu nombre: ";

		for (int vez = 0; vez < 5; vez++) {
			Button button = new Button ();
			button.Label = "Botón " + vez;
			button.Visible = true;
			vBoxMain.Add (button);
			button.Clicked += delegate {
				Console.WriteLine ("Pulsado " + button.Label);
			
			};
		}
	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Console.WriteLine ("OnDeleteEvent");
		Application.Quit ();
		a.RetVal = true;
	}

	protected void OnButtonGoForwardClicked (object sender, EventArgs e)
	{
		labelSaludo.Text = "Hola " + entryNombre.Text;
	}
}
