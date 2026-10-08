#tag Class
Protected Class ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties

	#tag Property, Flags = &h0
		hc_tags As OpenAPIClient.Models.ConfigNodePropertyArray
	#tag EndProperty


	#tag Property, Flags = &h0
		dispatcher_address As OpenAPIClient.Models.ConfigNodePropertyString
	#tag EndProperty


	#tag Property, Flags = &h0
		dispatcher_filter_allowed As OpenAPIClient.Models.ConfigNodePropertyArray
	#tag EndProperty


	#tag Property, Flags = &h0
		dispatcher_filter_blocked As OpenAPIClient.Models.ConfigNodePropertyArray
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
		#tag ViewProperty
			Name="hc_tags"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyArray"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="dispatcher_address"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyString"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="dispatcher_filter_allowed"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyArray"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="dispatcher_filter_blocked"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyArray"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


