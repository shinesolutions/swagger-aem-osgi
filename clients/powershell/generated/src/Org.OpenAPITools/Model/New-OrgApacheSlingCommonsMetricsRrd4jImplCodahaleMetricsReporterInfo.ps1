function New-OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${pid},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${title},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${description},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties]]
        ${properties},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${bundleUnderscorelocation},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${serviceUnderscorelocation}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo -ArgumentList @(
            ${pid},
            ${title},
            ${description},
            ${properties},
            ${bundleUnderscorelocation},
            ${serviceUnderscorelocation}
        )
    }
}
