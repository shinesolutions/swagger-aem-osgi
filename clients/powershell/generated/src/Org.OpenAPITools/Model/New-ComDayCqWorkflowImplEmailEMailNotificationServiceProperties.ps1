function New-ComDayCqWorkflowImplEmailEMailNotificationServiceProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${fromPeriodaddress},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${hostPeriodprefix},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${notifyPeriodonabort},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${notifyPeriodoncomplete},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${notifyPeriodoncontainercomplete},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${notifyPerioduseronly}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWorkflowImplEmailEMailNotificationServiceProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWorkflowImplEmailEMailNotificationServiceProperties -ArgumentList @(
            ${fromPeriodaddress},
            ${hostPeriodprefix},
            ${notifyPeriodonabort},
            ${notifyPeriodoncomplete},
            ${notifyPeriodoncontainercomplete},
            ${notifyPerioduseronly}
        )
    }
}
