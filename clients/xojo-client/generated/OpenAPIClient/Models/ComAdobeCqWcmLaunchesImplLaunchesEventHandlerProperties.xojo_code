#tag Class
Protected Class ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties

	#tag Property, Flags = &h0
		event_filter As OpenAPIClient.Models.ConfigNodePropertyString
	#tag EndProperty


	#tag Property, Flags = &h0
		launches_eventhandler_threadpool_maxsize As OpenAPIClient.Models.ConfigNodePropertyInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		launches_eventhandler_threadpool_priority As OpenAPIClient.Models.ConfigNodePropertyDropDown
	#tag EndProperty


	#tag Property, Flags = &h0
		launches_eventhandler_updatelastmodification As OpenAPIClient.Models.ConfigNodePropertyBoolean
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
			Name="event_filter"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyString"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="launches_eventhandler_threadpool_maxsize"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyInteger"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="launches_eventhandler_threadpool_priority"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyDropDown"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="launches_eventhandler_updatelastmodification"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyBoolean"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


