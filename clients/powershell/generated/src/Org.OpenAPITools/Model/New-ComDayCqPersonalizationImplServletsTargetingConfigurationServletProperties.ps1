function New-ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${forcelocation}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties -ArgumentList @(
            ${forcelocation}
        )
    }
}
