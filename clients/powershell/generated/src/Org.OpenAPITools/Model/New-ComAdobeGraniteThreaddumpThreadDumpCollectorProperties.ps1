function New-ComAdobeGraniteThreaddumpThreadDumpCollectorProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${schedulerPeriodperiod},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${schedulerPeriodrunOn},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${granitePeriodthreaddumpPeriodenabled},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${granitePeriodthreaddumpPerioddumpsPerFile},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${granitePeriodthreaddumpPeriodenableGzipCompression},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${granitePeriodthreaddumpPeriodenableDirectoriesCompression},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${granitePeriodthreaddumpPeriodenableJStack},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${granitePeriodthreaddumpPeriodmaxBackupDays},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${granitePeriodthreaddumpPeriodbackupCleanTrigger}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteThreaddumpThreadDumpCollectorProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteThreaddumpThreadDumpCollectorProperties -ArgumentList @(
            ${schedulerPeriodperiod},
            ${schedulerPeriodrunOn},
            ${granitePeriodthreaddumpPeriodenabled},
            ${granitePeriodthreaddumpPerioddumpsPerFile},
            ${granitePeriodthreaddumpPeriodenableGzipCompression},
            ${granitePeriodthreaddumpPeriodenableDirectoriesCompression},
            ${granitePeriodthreaddumpPeriodenableJStack},
            ${granitePeriodthreaddumpPeriodmaxBackupDays},
            ${granitePeriodthreaddumpPeriodbackupCleanTrigger}
        )
    }
}
