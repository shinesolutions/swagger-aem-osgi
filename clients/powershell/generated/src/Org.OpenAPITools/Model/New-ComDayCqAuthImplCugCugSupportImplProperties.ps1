function New-ComDayCqAuthImplCugCugSupportImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cugPeriodexemptedPeriodprincipals},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${cugPeriodenabled},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cugPeriodprincipalsPeriodregex},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cugPeriodprincipalsPeriodreplacement}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqAuthImplCugCugSupportImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqAuthImplCugCugSupportImplProperties -ArgumentList @(
            ${cugPeriodexemptedPeriodprincipals},
            ${cugPeriodenabled},
            ${cugPeriodprincipalsPeriodregex},
            ${cugPeriodprincipalsPeriodreplacement}
        )
    }
}
