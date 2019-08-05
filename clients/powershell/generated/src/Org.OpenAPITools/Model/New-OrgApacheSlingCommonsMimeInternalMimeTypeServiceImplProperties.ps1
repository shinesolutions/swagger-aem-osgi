function New-OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${mimePeriodtypes}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties -ArgumentList @(
            ${mimePeriodtypes}
        )
    }
}
