#tag Class
Protected Class ComAdobeCqAccountApiAccountManagementServiceProperties

	#tag Property, Flags = &h0
		cq_accountmanager_token_validity_period As OpenAPIClient.Models.ConfigNodePropertyInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		cq_accountmanager_config_requestnewaccount_mail As OpenAPIClient.Models.ConfigNodePropertyString
	#tag EndProperty


	#tag Property, Flags = &h0
		cq_accountmanager_config_requestnewpwd_mail As OpenAPIClient.Models.ConfigNodePropertyString
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
			Name="cq_accountmanager_token_validity_period"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyInteger"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="cq_accountmanager_config_requestnewaccount_mail"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyString"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="cq_accountmanager_config_requestnewpwd_mail"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyString"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


