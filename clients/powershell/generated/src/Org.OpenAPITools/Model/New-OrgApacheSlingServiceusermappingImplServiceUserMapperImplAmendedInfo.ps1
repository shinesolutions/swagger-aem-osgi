function New-OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo {
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
        [System.Nullable[Org.OpenAPITools.Model.OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties]]
        ${properties}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo -ArgumentList @(
            ${pid},
            ${title},
            ${description},
            ${properties}
        )
    }
}
