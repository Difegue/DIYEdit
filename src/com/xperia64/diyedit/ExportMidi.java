package com.xperia64.diyedit;

import java.io.File;
import java.io.IOException;

import com.xperia64.diyedit.editors.RecordEdit;

// Vestigial class. Don't use this anyway it sucked
public class ExportMidi {

	byte[] bb;
	public ExportMidi(byte[] b)
	{
		bb=b;
	}
	public void export(String filename, boolean play)
	{	
		
	}
	public void PlayPause()
	{
	}
	public void Stop()
	{
	}
	public boolean playing()
	{
		return false;
	}
	public boolean paused()
	{
		return false;
	}
	
}
