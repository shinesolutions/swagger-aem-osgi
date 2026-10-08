#tag Class
Protected Class ComDayCommonsHttpclientProperties

	#tag Property, Flags = &h0
		proxy_enabled As OpenAPIClient.Models.ConfigNodePropertyBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		proxy_host As OpenAPIClient.Models.ConfigNodePropertyString
	#tag EndProperty


	#tag Property, Flags = &h0
		proxy_user As OpenAPIClient.Models.ConfigNodePropertyString
	#tag EndProperty


	#tag Property, Flags = &h0
		proxy_password As OpenAPIClient.Models.ConfigNodePropertyString
	#tag EndProperty


	#tag Property, Flags = &h0
		proxy_ntlm_host As OpenAPIClient.Models.ConfigNodePropertyString
	#tag EndProperty


	#tag Property, Flags = &h0
		proxy_ntlm_domain As OpenAPIClient.Models.ConfigNodePropertyString
	#tag EndProperty


	#tag Property, Flags = &h0
		proxy_exceptions As OpenAPIClient.Models.ConfigNodePropertyArray
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
			Name="proxy_enabled"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyBoolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="proxy_host"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyString"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="proxy_user"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyString"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="proxy_password"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyString"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="proxy_ntlm_host"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyString"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="proxy_ntlm_domain"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyString"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="proxy_exceptions"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyArray"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


