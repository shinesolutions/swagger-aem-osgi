function New-ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${defaultPeriodtimeout},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${maxPeriodtimeout},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${defaultPeriodperiod}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties -ArgumentList @(
            ${defaultPeriodtimeout},
            ${maxPeriodtimeout},
            ${defaultPeriodperiod}
        )
    }
}
