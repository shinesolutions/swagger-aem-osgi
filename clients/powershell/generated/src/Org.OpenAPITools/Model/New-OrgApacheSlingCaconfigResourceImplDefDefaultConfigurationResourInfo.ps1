function New-OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo {
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
        [System.Nullable[Org.OpenAPITools.Model.OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties]]
        ${properties},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${bundleUnderscorelocation},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${serviceUnderscorelocation}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo -ArgumentList @(
            ${pid},
            ${title},
            ${description},
            ${properties},
            ${bundleUnderscorelocation},
            ${serviceUnderscorelocation}
        )
    }
}
