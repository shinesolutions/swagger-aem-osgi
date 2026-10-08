#tag Class
Protected Class ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfoOptional
	#tag Method, Flags = &h0
		Function Operator_Convert() As OpenAPIClient.Models.ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo
		  Return Value
		End Function
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub Operator_Convert(rhs As OpenAPIClient.Models.ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo)
		  Value = rhs
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub Set(Assigns rhs As OpenAPIClient.Models.ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo)
		  Value = rhs
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Function ToString() As String
		  Return OpenAPIClient.Models.ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfoToString(Value)
		End Function
	#tag EndMethod

	#tag Property, Flags = &h0
		Value As OpenAPIClient.Models.ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo
	#tag EndProperty


	#tag ViewBehavior
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass
