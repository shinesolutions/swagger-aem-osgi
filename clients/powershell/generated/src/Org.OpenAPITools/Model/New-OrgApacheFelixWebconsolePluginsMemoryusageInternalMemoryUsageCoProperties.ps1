function New-OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${felixPeriodmemoryusagePerioddumpPeriodthreshold},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${felixPeriodmemoryusagePerioddumpPeriodinterval},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${felixPeriodmemoryusagePerioddumpPeriodlocation}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties -ArgumentList @(
            ${felixPeriodmemoryusagePerioddumpPeriodthreshold},
            ${felixPeriodmemoryusagePerioddumpPeriodinterval},
            ${felixPeriodmemoryusagePerioddumpPeriodlocation}
        )
    }
}
