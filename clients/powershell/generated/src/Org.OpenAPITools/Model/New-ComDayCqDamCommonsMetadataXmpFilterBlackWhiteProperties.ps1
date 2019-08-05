function New-ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${xmpPeriodfilterPeriodapplyUnderscorewhitelist},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${xmpPeriodfilterPeriodwhitelist},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${xmpPeriodfilterPeriodapplyUnderscoreblacklist},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${xmpPeriodfilterPeriodblacklist}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties -ArgumentList @(
            ${xmpPeriodfilterPeriodapplyUnderscorewhitelist},
            ${xmpPeriodfilterPeriodwhitelist},
            ${xmpPeriodfilterPeriodapplyUnderscoreblacklist},
            ${xmpPeriodfilterPeriodblacklist}
        )
    }
}
