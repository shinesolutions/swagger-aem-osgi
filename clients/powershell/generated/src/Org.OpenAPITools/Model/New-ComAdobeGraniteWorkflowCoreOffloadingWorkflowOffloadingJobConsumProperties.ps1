function New-ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${jobPeriodtopics}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties -ArgumentList @(
            ${jobPeriodtopics}
        )
    }
}
