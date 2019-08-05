function New-OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${totalWidth},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${colWidthName},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${colWidthResult},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${colWidthTiming}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties -ArgumentList @(
            ${totalWidth},
            ${colWidthName},
            ${colWidthResult},
            ${colWidthTiming}
        )
    }
}
