function New-ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${granitePeriodworkflowPeriodWorkflowPublishEventServicePeriodenabled}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties -ArgumentList @(
            ${granitePeriodworkflowPeriodWorkflowPublishEventServicePeriodenabled}
        )
    }
}
