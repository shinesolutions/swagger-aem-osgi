function New-ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${schedulerPeriodexpression},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${jobPeriodpurgePeriodthreshold},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${jobPeriodpurgePeriodmaxPeriodjobs}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties -ArgumentList @(
            ${schedulerPeriodexpression},
            ${jobPeriodpurgePeriodthreshold},
            ${jobPeriodpurgePeriodmaxPeriodjobs}
        )
    }
}
