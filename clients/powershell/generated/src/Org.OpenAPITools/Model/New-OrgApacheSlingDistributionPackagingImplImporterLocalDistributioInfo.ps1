function New-OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo {
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
        [System.Nullable[Org.OpenAPITools.Model.OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties]]
        ${properties}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo -ArgumentList @(
            ${pid},
            ${title},
            ${description},
            ${properties}
        )
    }
}
