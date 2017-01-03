// ***************************************************************************
//
// Copyright (c) 2000 - 2017, Lawrence Livermore National Security, LLC
// Produced at the Lawrence Livermore National Laboratory
// LLNL-CODE-442911
// All rights reserved.
//
// This file is  part of VisIt. For  details, see https://visit.llnl.gov/.  The
// full copyright notice is contained in the file COPYRIGHT located at the root
// of the VisIt distribution or at http://www.llnl.gov/visit/copyright.html.
//
// Redistribution  and  use  in  source  and  binary  forms,  with  or  without
// modification, are permitted provided that the following conditions are met:
//
//  - Redistributions of  source code must  retain the above  copyright notice,
//    this list of conditions and the disclaimer below.
//  - Redistributions in binary form must reproduce the above copyright notice,
//    this  list of  conditions  and  the  disclaimer (as noted below)  in  the
//    documentation and/or other materials provided with the distribution.
//  - Neither the name of  the LLNS/LLNL nor the names of  its contributors may
//    be used to endorse or promote products derived from this software without
//    specific prior written permission.
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT  HOLDERS AND CONTRIBUTORS "AS IS"
// AND ANY EXPRESS OR  IMPLIED WARRANTIES, INCLUDING,  BUT NOT  LIMITED TO, THE
// IMPLIED WARRANTIES OF MERCHANTABILITY AND  FITNESS FOR A PARTICULAR  PURPOSE
// ARE  DISCLAIMED. IN  NO EVENT  SHALL LAWRENCE  LIVERMORE NATIONAL  SECURITY,
// LLC, THE  U.S.  DEPARTMENT OF  ENERGY  OR  CONTRIBUTORS BE  LIABLE  FOR  ANY
// DIRECT,  INDIRECT,   INCIDENTAL,   SPECIAL,   EXEMPLARY,  OR   CONSEQUENTIAL
// DAMAGES (INCLUDING, BUT NOT  LIMITED TO, PROCUREMENT OF  SUBSTITUTE GOODS OR
// SERVICES; LOSS OF  USE, DATA, OR PROFITS; OR  BUSINESS INTERRUPTION) HOWEVER
// CAUSED  AND  ON  ANY  THEORY  OF  LIABILITY,  WHETHER  IN  CONTRACT,  STRICT
// LIABILITY, OR TORT  (INCLUDING NEGLIGENCE OR OTHERWISE)  ARISING IN ANY  WAY
// OUT OF THE  USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH
// DAMAGE.
//
// ***************************************************************************

package llnl.visit;

import java.lang.Byte;
import java.util.Vector;

// ****************************************************************************
// Class: ViewerClientInformationElement
//
// Purpose:
//    This class contains the raw element
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

public class ViewerClientInformationElement extends AttributeSubject
{
    private static int ViewerClientInformationElement_numAdditionalAtts = 5;

    public ViewerClientInformationElement()
    {
        super(ViewerClientInformationElement_numAdditionalAtts);

        data = new String("");
        rawData = new Vector();
        format = 0;
        isRaw = false;
        windowId = -1;
    }

    public ViewerClientInformationElement(int nMoreFields)
    {
        super(ViewerClientInformationElement_numAdditionalAtts + nMoreFields);

        data = new String("");
        rawData = new Vector();
        format = 0;
        isRaw = false;
        windowId = -1;
    }

    public ViewerClientInformationElement(ViewerClientInformationElement obj)
    {
        super(ViewerClientInformationElement_numAdditionalAtts);

        int i;

        data = new String(obj.data);
        rawData = new Vector(obj.rawData.size());
        for(i = 0; i < obj.rawData.size(); ++i)
        {
            Byte bv = (Byte)obj.rawData.elementAt(i);
            rawData.addElement(new Byte(bv.byteValue()));
        }

        format = obj.format;
        isRaw = obj.isRaw;
        windowId = obj.windowId;

        SelectAll();
    }

    public int Offset()
    {
        return super.Offset() + super.GetNumAdditionalAttributes();
    }

    public int GetNumAdditionalAttributes()
    {
        return ViewerClientInformationElement_numAdditionalAtts;
    }

    public boolean equals(ViewerClientInformationElement obj)
    {
        int i;

        // Compare the elements in the rawData vector.
        boolean rawData_equal = (obj.rawData.size() == rawData.size());
        for(i = 0; (i < rawData.size()) && rawData_equal; ++i)
        {
            // Make references to Byte from Object.
            Byte rawData1 = (Byte)rawData.elementAt(i);
            Byte rawData2 = (Byte)obj.rawData.elementAt(i);
            rawData_equal = rawData1.equals(rawData2);
        }
        // Create the return value
        return ((data.equals(obj.data)) &&
                rawData_equal &&
                (format == obj.format) &&
                (isRaw == obj.isRaw) &&
                (windowId == obj.windowId));
    }

    // Property setting methods
    public void SetData(String data_)
    {
        data = data_;
        Select(0);
    }

    public void SetRawData(Vector rawData_)
    {
        rawData = rawData_;
        Select(1);
    }

    public void SetFormat(int format_)
    {
        format = format_;
        Select(2);
    }

    public void SetIsRaw(boolean isRaw_)
    {
        isRaw = isRaw_;
        Select(3);
    }

    public void SetWindowId(int windowId_)
    {
        windowId = windowId_;
        Select(4);
    }

    // Property getting methods
    public String  GetData() { return data; }
    public Vector  GetRawData() { return rawData; }
    public int     GetFormat() { return format; }
    public boolean GetIsRaw() { return isRaw; }
    public int     GetWindowId() { return windowId; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        if(WriteSelect(0, buf))
            buf.WriteString(data);
        if(WriteSelect(1, buf))
            buf.WriteByteVector(rawData);
        if(WriteSelect(2, buf))
            buf.WriteInt(format);
        if(WriteSelect(3, buf))
            buf.WriteBool(isRaw);
        if(WriteSelect(4, buf))
            buf.WriteInt(windowId);
    }

    public void ReadAtts(int index, CommunicationBuffer buf)
    {
        switch(index)
        {
        case 0:
            SetData(buf.ReadString());
            break;
        case 1:
            SetRawData(buf.ReadByteVector());
            break;
        case 2:
            SetFormat(buf.ReadInt());
            break;
        case 3:
            SetIsRaw(buf.ReadBool());
            break;
        case 4:
            SetWindowId(buf.ReadInt());
            break;
        }
    }

    public String toString(String indent)
    {
        String str = new String();
        str = str + stringToString("data", data, indent) + "\n";
        str = str + ucharVectorToString("rawData", rawData, indent) + "\n";
        str = str + intToString("format", format, indent) + "\n";
        str = str + boolToString("isRaw", isRaw, indent) + "\n";
        str = str + intToString("windowId", windowId, indent) + "\n";
        return str;
    }


    // Attributes
    private String  data;
    private Vector  rawData; // vector of Byte objects
    private int     format;
    private boolean isRaw;
    private int     windowId;
}

