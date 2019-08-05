function New-ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${parameterPeriodwhitelist},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${parameterPeriodwhitelistPeriodprefixes},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${binaryPeriodparameterPeriodwhitelist},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${modifierPeriodwhitelist},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${operationPeriodwhitelist},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${operationPeriodwhitelistPeriodprefixes},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${typehintPeriodwhitelist},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${resourcetypePeriodwhitelist}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties -ArgumentList @(
            ${parameterPeriodwhitelist},
            ${parameterPeriodwhitelistPeriodprefixes},
            ${binaryPeriodparameterPeriodwhitelist},
            ${modifierPeriodwhitelist},
            ${operationPeriodwhitelist},
            ${operationPeriodwhitelistPeriodprefixes},
            ${typehintPeriodwhitelist},
            ${resourcetypePeriodwhitelist}
        )
    }
}
