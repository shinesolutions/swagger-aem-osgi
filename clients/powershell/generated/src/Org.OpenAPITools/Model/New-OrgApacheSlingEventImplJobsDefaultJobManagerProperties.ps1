function New-OrgApacheSlingEventImplJobsDefaultJobManagerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${queuePeriodpriority},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${queuePeriodretries},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${queuePeriodretrydelay},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${queuePeriodmaxparallel}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingEventImplJobsDefaultJobManagerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingEventImplJobsDefaultJobManagerProperties -ArgumentList @(
            ${queuePeriodpriority},
            ${queuePeriodretries},
            ${queuePeriodretrydelay},
            ${queuePeriodmaxparallel}
        )
    }
}
