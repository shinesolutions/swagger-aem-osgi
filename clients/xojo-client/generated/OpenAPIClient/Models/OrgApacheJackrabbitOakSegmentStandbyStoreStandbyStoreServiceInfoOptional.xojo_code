#tag Class
Protected Class OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfoOptional
	#tag Method, Flags = &h0
		Function Operator_Convert() As OpenAPIClient.Models.OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo
		  Return Value
		End Function
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub Operator_Convert(rhs As OpenAPIClient.Models.OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo)
		  Value = rhs
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub Set(Assigns rhs As OpenAPIClient.Models.OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo)
		  Value = rhs
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Function ToString() As String
		  Return OpenAPIClient.Models.OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfoToString(Value)
		End Function
	#tag EndMethod

	#tag Property, Flags = &h0
		Value As OpenAPIClient.Models.OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo
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
