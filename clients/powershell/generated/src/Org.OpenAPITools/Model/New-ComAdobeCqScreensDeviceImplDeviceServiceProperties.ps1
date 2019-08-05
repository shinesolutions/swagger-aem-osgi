function New-ComAdobeCqScreensDeviceImplDeviceServiceProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${comPeriodadobePeriodaemPeriodscreensPeriodplayerPeriodpingfrequency},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodspecialchars},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodminlowercasechars},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodminuppercasechars},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodminnumberchars},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodminspecialchars},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodminlength}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqScreensDeviceImplDeviceServiceProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqScreensDeviceImplDeviceServiceProperties -ArgumentList @(
            ${comPeriodadobePeriodaemPeriodscreensPeriodplayerPeriodpingfrequency},
            ${comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodspecialchars},
            ${comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodminlowercasechars},
            ${comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodminuppercasechars},
            ${comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodminnumberchars},
            ${comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodminspecialchars},
            ${comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodminlength}
        )
    }
}
