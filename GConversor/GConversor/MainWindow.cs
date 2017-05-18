using System;
using Gtk;

public partial class MainWindow: Gtk.Window
{	

	public MainWindow (): base (Gtk.WindowType.Toplevel)
	{
		Build ();
	}


	protected void OnConvertirClicked (object sender, System.EventArgs e)
	{
		double euros, dolares, pesos, libras, yenes, rublos, coronas, reales, rupias;
		euros = Convert.ToDouble(ingresar.Text);

		dolares = Convert.ToDouble(valordolar.Text);
		dolaresC.Text = ((dolares * euros)/1000000000).ToString();

		pesos = Convert.ToDouble(valorpeso.Text);
		pesosC.Text = ((pesos * euros)/1000000000).ToString ();

		libras = Convert.ToDouble(valorlibra.Text);
		librasC.Text = ((libras * euros)/100000000).ToString ();

		yenes = Convert.ToDouble(valoryen.Text);
		yenesC.Text = ((yenes * euros)/100).ToString();

		rublos = Convert.ToDouble(valorrublo.Text);
		rublosC.Text = ((rublos * euros)/100000).ToString ();

		coronas = Convert.ToDouble(valorcorona.Text);
		coronasC.Text = ((coronas * euros)/100000).ToString ();

		reales = Convert.ToDouble(valorreal.Text);
		realesC.Text = ((reales * euros)/10000).ToString ();

		rupias = Convert.ToDouble(valorrupia.Text);
		rupiasC.Text = ((rupias * euros)/100).ToString ();


	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Application.Quit ();
		a.RetVal = true;
	}
}
