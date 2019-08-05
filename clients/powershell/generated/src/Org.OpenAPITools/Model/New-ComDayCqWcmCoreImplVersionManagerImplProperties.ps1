function New-ComDayCqWcmCoreImplVersionManagerImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${versionmanagerPeriodcreateVersionOnActivation},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${versionmanagerPeriodpurgingEnabled},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${versionmanagerPeriodpurgePaths},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${versionmanagerPeriodivPaths},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${versionmanagerPeriodmaxAgeDays},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${versionmanagerPeriodmaxNumberVersions},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${versionmanagerPeriodminNumberVersions}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmCoreImplVersionManagerImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmCoreImplVersionManagerImplProperties -ArgumentList @(
            ${versionmanagerPeriodcreateVersionOnActivation},
            ${versionmanagerPeriodpurgingEnabled},
            ${versionmanagerPeriodpurgePaths},
            ${versionmanagerPeriodivPaths},
            ${versionmanagerPeriodmaxAgeDays},
            ${versionmanagerPeriodmaxNumberVersions},
            ${versionmanagerPeriodminNumberVersions}
        )
    }
}
