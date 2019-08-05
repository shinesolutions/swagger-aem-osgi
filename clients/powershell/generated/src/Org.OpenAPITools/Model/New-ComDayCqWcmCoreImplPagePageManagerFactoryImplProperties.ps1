function New-ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${illegalCharMapping},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${pageSubTreeActivationCheck}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties -ArgumentList @(
            ${illegalCharMapping},
            ${pageSubTreeActivationCheck}
        )
    }
}
