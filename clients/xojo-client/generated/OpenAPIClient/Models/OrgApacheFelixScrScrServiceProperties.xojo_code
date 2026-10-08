#tag Class
Protected Class OrgApacheFelixScrScrServiceProperties

	#tag Property, Flags = &h0
		ds_loglevel As OpenAPIClient.Models.ConfigNodePropertyDropDown
	#tag EndProperty


	#tag Property, Flags = &h0
		ds_factory_enabled As OpenAPIClient.Models.ConfigNodePropertyBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		ds_delayed_keepInstances As OpenAPIClient.Models.ConfigNodePropertyBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		ds_lock_timeout_milliseconds As OpenAPIClient.Models.ConfigNodePropertyInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		ds_stop_timeout_milliseconds As OpenAPIClient.Models.ConfigNodePropertyInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		ds_global_extender As OpenAPIClient.Models.ConfigNodePropertyBoolean
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
			Name="ds_loglevel"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyDropDown"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ds_factory_enabled"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyBoolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ds_delayed_keepInstances"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyBoolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ds_lock_timeout_milliseconds"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyInteger"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ds_stop_timeout_milliseconds"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyInteger"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ds_global_extender"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyBoolean"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


