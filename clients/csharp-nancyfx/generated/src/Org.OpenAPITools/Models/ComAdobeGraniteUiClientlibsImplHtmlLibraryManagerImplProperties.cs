using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties
    /// </summary>
    public sealed class ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties:  IEquatable<ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties>
    { 
        /// <summary>
        /// HtmllibmanagerTiming
        /// </summary>
        public ConfigNodePropertyBoolean HtmllibmanagerTiming { get; private set; }

        /// <summary>
        /// HtmllibmanagerDebugInitJs
        /// </summary>
        public ConfigNodePropertyString HtmllibmanagerDebugInitJs { get; private set; }

        /// <summary>
        /// HtmllibmanagerMinify
        /// </summary>
        public ConfigNodePropertyBoolean HtmllibmanagerMinify { get; private set; }

        /// <summary>
        /// HtmllibmanagerDebug
        /// </summary>
        public ConfigNodePropertyBoolean HtmllibmanagerDebug { get; private set; }

        /// <summary>
        /// HtmllibmanagerGzip
        /// </summary>
        public ConfigNodePropertyBoolean HtmllibmanagerGzip { get; private set; }

        /// <summary>
        /// HtmllibmanagerMaxDataUriSize
        /// </summary>
        public ConfigNodePropertyInteger HtmllibmanagerMaxDataUriSize { get; private set; }

        /// <summary>
        /// HtmllibmanagerMaxage
        /// </summary>
        public ConfigNodePropertyInteger HtmllibmanagerMaxage { get; private set; }

        /// <summary>
        /// HtmllibmanagerForceCQUrlInfo
        /// </summary>
        public ConfigNodePropertyBoolean HtmllibmanagerForceCQUrlInfo { get; private set; }

        /// <summary>
        /// HtmllibmanagerDefaultthemename
        /// </summary>
        public ConfigNodePropertyString HtmllibmanagerDefaultthemename { get; private set; }

        /// <summary>
        /// HtmllibmanagerDefaultuserthemename
        /// </summary>
        public ConfigNodePropertyString HtmllibmanagerDefaultuserthemename { get; private set; }

        /// <summary>
        /// HtmllibmanagerClientmanager
        /// </summary>
        public ConfigNodePropertyString HtmllibmanagerClientmanager { get; private set; }

        /// <summary>
        /// HtmllibmanagerPathList
        /// </summary>
        public ConfigNodePropertyArray HtmllibmanagerPathList { get; private set; }

        /// <summary>
        /// HtmllibmanagerExcludedPathList
        /// </summary>
        public ConfigNodePropertyArray HtmllibmanagerExcludedPathList { get; private set; }

        /// <summary>
        /// HtmllibmanagerProcessorJs
        /// </summary>
        public ConfigNodePropertyArray HtmllibmanagerProcessorJs { get; private set; }

        /// <summary>
        /// HtmllibmanagerProcessorCss
        /// </summary>
        public ConfigNodePropertyArray HtmllibmanagerProcessorCss { get; private set; }

        /// <summary>
        /// HtmllibmanagerLongcachePatterns
        /// </summary>
        public ConfigNodePropertyArray HtmllibmanagerLongcachePatterns { get; private set; }

        /// <summary>
        /// HtmllibmanagerLongcacheFormat
        /// </summary>
        public ConfigNodePropertyString HtmllibmanagerLongcacheFormat { get; private set; }

        /// <summary>
        /// HtmllibmanagerUseFileSystemOutputCache
        /// </summary>
        public ConfigNodePropertyBoolean HtmllibmanagerUseFileSystemOutputCache { get; private set; }

        /// <summary>
        /// HtmllibmanagerFileSystemOutputCacheLocation
        /// </summary>
        public ConfigNodePropertyString HtmllibmanagerFileSystemOutputCacheLocation { get; private set; }

        /// <summary>
        /// HtmllibmanagerDisableReplacement
        /// </summary>
        public ConfigNodePropertyArray HtmllibmanagerDisableReplacement { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties()
        {
        }

        private ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties(ConfigNodePropertyBoolean HtmllibmanagerTiming, ConfigNodePropertyString HtmllibmanagerDebugInitJs, ConfigNodePropertyBoolean HtmllibmanagerMinify, ConfigNodePropertyBoolean HtmllibmanagerDebug, ConfigNodePropertyBoolean HtmllibmanagerGzip, ConfigNodePropertyInteger HtmllibmanagerMaxDataUriSize, ConfigNodePropertyInteger HtmllibmanagerMaxage, ConfigNodePropertyBoolean HtmllibmanagerForceCQUrlInfo, ConfigNodePropertyString HtmllibmanagerDefaultthemename, ConfigNodePropertyString HtmllibmanagerDefaultuserthemename, ConfigNodePropertyString HtmllibmanagerClientmanager, ConfigNodePropertyArray HtmllibmanagerPathList, ConfigNodePropertyArray HtmllibmanagerExcludedPathList, ConfigNodePropertyArray HtmllibmanagerProcessorJs, ConfigNodePropertyArray HtmllibmanagerProcessorCss, ConfigNodePropertyArray HtmllibmanagerLongcachePatterns, ConfigNodePropertyString HtmllibmanagerLongcacheFormat, ConfigNodePropertyBoolean HtmllibmanagerUseFileSystemOutputCache, ConfigNodePropertyString HtmllibmanagerFileSystemOutputCacheLocation, ConfigNodePropertyArray HtmllibmanagerDisableReplacement)
        {
            
            this.HtmllibmanagerTiming = HtmllibmanagerTiming;
            
            this.HtmllibmanagerDebugInitJs = HtmllibmanagerDebugInitJs;
            
            this.HtmllibmanagerMinify = HtmllibmanagerMinify;
            
            this.HtmllibmanagerDebug = HtmllibmanagerDebug;
            
            this.HtmllibmanagerGzip = HtmllibmanagerGzip;
            
            this.HtmllibmanagerMaxDataUriSize = HtmllibmanagerMaxDataUriSize;
            
            this.HtmllibmanagerMaxage = HtmllibmanagerMaxage;
            
            this.HtmllibmanagerForceCQUrlInfo = HtmllibmanagerForceCQUrlInfo;
            
            this.HtmllibmanagerDefaultthemename = HtmllibmanagerDefaultthemename;
            
            this.HtmllibmanagerDefaultuserthemename = HtmllibmanagerDefaultuserthemename;
            
            this.HtmllibmanagerClientmanager = HtmllibmanagerClientmanager;
            
            this.HtmllibmanagerPathList = HtmllibmanagerPathList;
            
            this.HtmllibmanagerExcludedPathList = HtmllibmanagerExcludedPathList;
            
            this.HtmllibmanagerProcessorJs = HtmllibmanagerProcessorJs;
            
            this.HtmllibmanagerProcessorCss = HtmllibmanagerProcessorCss;
            
            this.HtmllibmanagerLongcachePatterns = HtmllibmanagerLongcachePatterns;
            
            this.HtmllibmanagerLongcacheFormat = HtmllibmanagerLongcacheFormat;
            
            this.HtmllibmanagerUseFileSystemOutputCache = HtmllibmanagerUseFileSystemOutputCache;
            
            this.HtmllibmanagerFileSystemOutputCacheLocation = HtmllibmanagerFileSystemOutputCacheLocation;
            
            this.HtmllibmanagerDisableReplacement = HtmllibmanagerDisableReplacement;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesBuilder</returns>
        public static ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesBuilder</returns>
        public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesBuilder With()
        {
            return Builder()
                .HtmllibmanagerTiming(HtmllibmanagerTiming)
                .HtmllibmanagerDebugInitJs(HtmllibmanagerDebugInitJs)
                .HtmllibmanagerMinify(HtmllibmanagerMinify)
                .HtmllibmanagerDebug(HtmllibmanagerDebug)
                .HtmllibmanagerGzip(HtmllibmanagerGzip)
                .HtmllibmanagerMaxDataUriSize(HtmllibmanagerMaxDataUriSize)
                .HtmllibmanagerMaxage(HtmllibmanagerMaxage)
                .HtmllibmanagerForceCQUrlInfo(HtmllibmanagerForceCQUrlInfo)
                .HtmllibmanagerDefaultthemename(HtmllibmanagerDefaultthemename)
                .HtmllibmanagerDefaultuserthemename(HtmllibmanagerDefaultuserthemename)
                .HtmllibmanagerClientmanager(HtmllibmanagerClientmanager)
                .HtmllibmanagerPathList(HtmllibmanagerPathList)
                .HtmllibmanagerExcludedPathList(HtmllibmanagerExcludedPathList)
                .HtmllibmanagerProcessorJs(HtmllibmanagerProcessorJs)
                .HtmllibmanagerProcessorCss(HtmllibmanagerProcessorCss)
                .HtmllibmanagerLongcachePatterns(HtmllibmanagerLongcachePatterns)
                .HtmllibmanagerLongcacheFormat(HtmllibmanagerLongcacheFormat)
                .HtmllibmanagerUseFileSystemOutputCache(HtmllibmanagerUseFileSystemOutputCache)
                .HtmllibmanagerFileSystemOutputCacheLocation(HtmllibmanagerFileSystemOutputCacheLocation)
                .HtmllibmanagerDisableReplacement(HtmllibmanagerDisableReplacement);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties left, ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties left, ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.
        /// </summary>
        public sealed class ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _HtmllibmanagerTiming;
            private ConfigNodePropertyString _HtmllibmanagerDebugInitJs;
            private ConfigNodePropertyBoolean _HtmllibmanagerMinify;
            private ConfigNodePropertyBoolean _HtmllibmanagerDebug;
            private ConfigNodePropertyBoolean _HtmllibmanagerGzip;
            private ConfigNodePropertyInteger _HtmllibmanagerMaxDataUriSize;
            private ConfigNodePropertyInteger _HtmllibmanagerMaxage;
            private ConfigNodePropertyBoolean _HtmllibmanagerForceCQUrlInfo;
            private ConfigNodePropertyString _HtmllibmanagerDefaultthemename;
            private ConfigNodePropertyString _HtmllibmanagerDefaultuserthemename;
            private ConfigNodePropertyString _HtmllibmanagerClientmanager;
            private ConfigNodePropertyArray _HtmllibmanagerPathList;
            private ConfigNodePropertyArray _HtmllibmanagerExcludedPathList;
            private ConfigNodePropertyArray _HtmllibmanagerProcessorJs;
            private ConfigNodePropertyArray _HtmllibmanagerProcessorCss;
            private ConfigNodePropertyArray _HtmllibmanagerLongcachePatterns;
            private ConfigNodePropertyString _HtmllibmanagerLongcacheFormat;
            private ConfigNodePropertyBoolean _HtmllibmanagerUseFileSystemOutputCache;
            private ConfigNodePropertyString _HtmllibmanagerFileSystemOutputCacheLocation;
            private ConfigNodePropertyArray _HtmllibmanagerDisableReplacement;

            internal ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.HtmllibmanagerTiming property.
            /// </summary>
            /// <param name="value">HtmllibmanagerTiming</param>
            public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesBuilder HtmllibmanagerTiming(ConfigNodePropertyBoolean value)
            {
                _HtmllibmanagerTiming = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.HtmllibmanagerDebugInitJs property.
            /// </summary>
            /// <param name="value">HtmllibmanagerDebugInitJs</param>
            public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesBuilder HtmllibmanagerDebugInitJs(ConfigNodePropertyString value)
            {
                _HtmllibmanagerDebugInitJs = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.HtmllibmanagerMinify property.
            /// </summary>
            /// <param name="value">HtmllibmanagerMinify</param>
            public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesBuilder HtmllibmanagerMinify(ConfigNodePropertyBoolean value)
            {
                _HtmllibmanagerMinify = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.HtmllibmanagerDebug property.
            /// </summary>
            /// <param name="value">HtmllibmanagerDebug</param>
            public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesBuilder HtmllibmanagerDebug(ConfigNodePropertyBoolean value)
            {
                _HtmllibmanagerDebug = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.HtmllibmanagerGzip property.
            /// </summary>
            /// <param name="value">HtmllibmanagerGzip</param>
            public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesBuilder HtmllibmanagerGzip(ConfigNodePropertyBoolean value)
            {
                _HtmllibmanagerGzip = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.HtmllibmanagerMaxDataUriSize property.
            /// </summary>
            /// <param name="value">HtmllibmanagerMaxDataUriSize</param>
            public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesBuilder HtmllibmanagerMaxDataUriSize(ConfigNodePropertyInteger value)
            {
                _HtmllibmanagerMaxDataUriSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.HtmllibmanagerMaxage property.
            /// </summary>
            /// <param name="value">HtmllibmanagerMaxage</param>
            public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesBuilder HtmllibmanagerMaxage(ConfigNodePropertyInteger value)
            {
                _HtmllibmanagerMaxage = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.HtmllibmanagerForceCQUrlInfo property.
            /// </summary>
            /// <param name="value">HtmllibmanagerForceCQUrlInfo</param>
            public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesBuilder HtmllibmanagerForceCQUrlInfo(ConfigNodePropertyBoolean value)
            {
                _HtmllibmanagerForceCQUrlInfo = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.HtmllibmanagerDefaultthemename property.
            /// </summary>
            /// <param name="value">HtmllibmanagerDefaultthemename</param>
            public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesBuilder HtmllibmanagerDefaultthemename(ConfigNodePropertyString value)
            {
                _HtmllibmanagerDefaultthemename = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.HtmllibmanagerDefaultuserthemename property.
            /// </summary>
            /// <param name="value">HtmllibmanagerDefaultuserthemename</param>
            public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesBuilder HtmllibmanagerDefaultuserthemename(ConfigNodePropertyString value)
            {
                _HtmllibmanagerDefaultuserthemename = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.HtmllibmanagerClientmanager property.
            /// </summary>
            /// <param name="value">HtmllibmanagerClientmanager</param>
            public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesBuilder HtmllibmanagerClientmanager(ConfigNodePropertyString value)
            {
                _HtmllibmanagerClientmanager = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.HtmllibmanagerPathList property.
            /// </summary>
            /// <param name="value">HtmllibmanagerPathList</param>
            public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesBuilder HtmllibmanagerPathList(ConfigNodePropertyArray value)
            {
                _HtmllibmanagerPathList = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.HtmllibmanagerExcludedPathList property.
            /// </summary>
            /// <param name="value">HtmllibmanagerExcludedPathList</param>
            public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesBuilder HtmllibmanagerExcludedPathList(ConfigNodePropertyArray value)
            {
                _HtmllibmanagerExcludedPathList = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.HtmllibmanagerProcessorJs property.
            /// </summary>
            /// <param name="value">HtmllibmanagerProcessorJs</param>
            public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesBuilder HtmllibmanagerProcessorJs(ConfigNodePropertyArray value)
            {
                _HtmllibmanagerProcessorJs = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.HtmllibmanagerProcessorCss property.
            /// </summary>
            /// <param name="value">HtmllibmanagerProcessorCss</param>
            public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesBuilder HtmllibmanagerProcessorCss(ConfigNodePropertyArray value)
            {
                _HtmllibmanagerProcessorCss = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.HtmllibmanagerLongcachePatterns property.
            /// </summary>
            /// <param name="value">HtmllibmanagerLongcachePatterns</param>
            public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesBuilder HtmllibmanagerLongcachePatterns(ConfigNodePropertyArray value)
            {
                _HtmllibmanagerLongcachePatterns = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.HtmllibmanagerLongcacheFormat property.
            /// </summary>
            /// <param name="value">HtmllibmanagerLongcacheFormat</param>
            public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesBuilder HtmllibmanagerLongcacheFormat(ConfigNodePropertyString value)
            {
                _HtmllibmanagerLongcacheFormat = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.HtmllibmanagerUseFileSystemOutputCache property.
            /// </summary>
            /// <param name="value">HtmllibmanagerUseFileSystemOutputCache</param>
            public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesBuilder HtmllibmanagerUseFileSystemOutputCache(ConfigNodePropertyBoolean value)
            {
                _HtmllibmanagerUseFileSystemOutputCache = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.HtmllibmanagerFileSystemOutputCacheLocation property.
            /// </summary>
            /// <param name="value">HtmllibmanagerFileSystemOutputCacheLocation</param>
            public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesBuilder HtmllibmanagerFileSystemOutputCacheLocation(ConfigNodePropertyString value)
            {
                _HtmllibmanagerFileSystemOutputCacheLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.HtmllibmanagerDisableReplacement property.
            /// </summary>
            /// <param name="value">HtmllibmanagerDisableReplacement</param>
            public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesBuilder HtmllibmanagerDisableReplacement(ConfigNodePropertyArray value)
            {
                _HtmllibmanagerDisableReplacement = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties</returns>
            public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties Build()
            {
                Validate();
                return new ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties(
                    HtmllibmanagerTiming: _HtmllibmanagerTiming,
                    HtmllibmanagerDebugInitJs: _HtmllibmanagerDebugInitJs,
                    HtmllibmanagerMinify: _HtmllibmanagerMinify,
                    HtmllibmanagerDebug: _HtmllibmanagerDebug,
                    HtmllibmanagerGzip: _HtmllibmanagerGzip,
                    HtmllibmanagerMaxDataUriSize: _HtmllibmanagerMaxDataUriSize,
                    HtmllibmanagerMaxage: _HtmllibmanagerMaxage,
                    HtmllibmanagerForceCQUrlInfo: _HtmllibmanagerForceCQUrlInfo,
                    HtmllibmanagerDefaultthemename: _HtmllibmanagerDefaultthemename,
                    HtmllibmanagerDefaultuserthemename: _HtmllibmanagerDefaultuserthemename,
                    HtmllibmanagerClientmanager: _HtmllibmanagerClientmanager,
                    HtmllibmanagerPathList: _HtmllibmanagerPathList,
                    HtmllibmanagerExcludedPathList: _HtmllibmanagerExcludedPathList,
                    HtmllibmanagerProcessorJs: _HtmllibmanagerProcessorJs,
                    HtmllibmanagerProcessorCss: _HtmllibmanagerProcessorCss,
                    HtmllibmanagerLongcachePatterns: _HtmllibmanagerLongcachePatterns,
                    HtmllibmanagerLongcacheFormat: _HtmllibmanagerLongcacheFormat,
                    HtmllibmanagerUseFileSystemOutputCache: _HtmllibmanagerUseFileSystemOutputCache,
                    HtmllibmanagerFileSystemOutputCacheLocation: _HtmllibmanagerFileSystemOutputCacheLocation,
                    HtmllibmanagerDisableReplacement: _HtmllibmanagerDisableReplacement
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}