function New-ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${notifyPeriodonupdate},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${notifyPeriodoncomplete}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties -ArgumentList @(
            ${notifyPeriodonupdate},
            ${notifyPeriodoncomplete}
        )
    }
}
