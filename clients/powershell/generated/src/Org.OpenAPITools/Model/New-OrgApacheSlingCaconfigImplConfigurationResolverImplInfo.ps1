function New-OrgApacheSlingCaconfigImplConfigurationResolverImplInfo {
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
        [System.Nullable[Org.OpenAPITools.Model.OrgApacheSlingCaconfigImplConfigurationResolverImplProperties]]
        ${properties},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${bundleUnderscorelocation},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${serviceUnderscorelocation}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingCaconfigImplConfigurationResolverImplInfo' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingCaconfigImplConfigurationResolverImplInfo -ArgumentList @(
            ${pid},
            ${title},
            ${description},
            ${properties},
            ${bundleUnderscorelocation},
            ${serviceUnderscorelocation}
        )
    }
}
