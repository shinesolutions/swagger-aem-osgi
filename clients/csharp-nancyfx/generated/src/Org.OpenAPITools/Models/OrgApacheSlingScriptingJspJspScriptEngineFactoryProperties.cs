using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties
    /// </summary>
    public sealed class OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties:  IEquatable<OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties>
    { 
        /// <summary>
        /// JasperCompilerTargetVM
        /// </summary>
        public ConfigNodePropertyString JasperCompilerTargetVM { get; private set; }

        /// <summary>
        /// JasperCompilerSourceVM
        /// </summary>
        public ConfigNodePropertyString JasperCompilerSourceVM { get; private set; }

        /// <summary>
        /// JasperClassdebuginfo
        /// </summary>
        public ConfigNodePropertyBoolean JasperClassdebuginfo { get; private set; }

        /// <summary>
        /// JasperEnablePooling
        /// </summary>
        public ConfigNodePropertyBoolean JasperEnablePooling { get; private set; }

        /// <summary>
        /// JasperIeClassId
        /// </summary>
        public ConfigNodePropertyString JasperIeClassId { get; private set; }

        /// <summary>
        /// JasperGenStringAsCharArray
        /// </summary>
        public ConfigNodePropertyBoolean JasperGenStringAsCharArray { get; private set; }

        /// <summary>
        /// JasperKeepgenerated
        /// </summary>
        public ConfigNodePropertyBoolean JasperKeepgenerated { get; private set; }

        /// <summary>
        /// JasperMappedfile
        /// </summary>
        public ConfigNodePropertyBoolean JasperMappedfile { get; private set; }

        /// <summary>
        /// JasperTrimSpaces
        /// </summary>
        public ConfigNodePropertyBoolean JasperTrimSpaces { get; private set; }

        /// <summary>
        /// JasperDisplaySourceFragments
        /// </summary>
        public ConfigNodePropertyBoolean JasperDisplaySourceFragments { get; private set; }

        /// <summary>
        /// DefaultIsSession
        /// </summary>
        public ConfigNodePropertyBoolean DefaultIsSession { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties()
        {
        }

        private OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties(ConfigNodePropertyString JasperCompilerTargetVM, ConfigNodePropertyString JasperCompilerSourceVM, ConfigNodePropertyBoolean JasperClassdebuginfo, ConfigNodePropertyBoolean JasperEnablePooling, ConfigNodePropertyString JasperIeClassId, ConfigNodePropertyBoolean JasperGenStringAsCharArray, ConfigNodePropertyBoolean JasperKeepgenerated, ConfigNodePropertyBoolean JasperMappedfile, ConfigNodePropertyBoolean JasperTrimSpaces, ConfigNodePropertyBoolean JasperDisplaySourceFragments, ConfigNodePropertyBoolean DefaultIsSession)
        {
            
            this.JasperCompilerTargetVM = JasperCompilerTargetVM;
            
            this.JasperCompilerSourceVM = JasperCompilerSourceVM;
            
            this.JasperClassdebuginfo = JasperClassdebuginfo;
            
            this.JasperEnablePooling = JasperEnablePooling;
            
            this.JasperIeClassId = JasperIeClassId;
            
            this.JasperGenStringAsCharArray = JasperGenStringAsCharArray;
            
            this.JasperKeepgenerated = JasperKeepgenerated;
            
            this.JasperMappedfile = JasperMappedfile;
            
            this.JasperTrimSpaces = JasperTrimSpaces;
            
            this.JasperDisplaySourceFragments = JasperDisplaySourceFragments;
            
            this.DefaultIsSession = DefaultIsSession;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties.
        /// </summary>
        /// <returns>OrgApacheSlingScriptingJspJspScriptEngineFactoryPropertiesBuilder</returns>
        public static OrgApacheSlingScriptingJspJspScriptEngineFactoryPropertiesBuilder Builder()
        {
            return new OrgApacheSlingScriptingJspJspScriptEngineFactoryPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingScriptingJspJspScriptEngineFactoryPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingScriptingJspJspScriptEngineFactoryPropertiesBuilder</returns>
        public OrgApacheSlingScriptingJspJspScriptEngineFactoryPropertiesBuilder With()
        {
            return Builder()
                .JasperCompilerTargetVM(JasperCompilerTargetVM)
                .JasperCompilerSourceVM(JasperCompilerSourceVM)
                .JasperClassdebuginfo(JasperClassdebuginfo)
                .JasperEnablePooling(JasperEnablePooling)
                .JasperIeClassId(JasperIeClassId)
                .JasperGenStringAsCharArray(JasperGenStringAsCharArray)
                .JasperKeepgenerated(JasperKeepgenerated)
                .JasperMappedfile(JasperMappedfile)
                .JasperTrimSpaces(JasperTrimSpaces)
                .JasperDisplaySourceFragments(JasperDisplaySourceFragments)
                .DefaultIsSession(DefaultIsSession);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties</param>
        /// <param name="right">Compared (OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties left, OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties</param>
        /// <param name="right">Compared (OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties left, OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties.
        /// </summary>
        public sealed class OrgApacheSlingScriptingJspJspScriptEngineFactoryPropertiesBuilder
        {
            private ConfigNodePropertyString _JasperCompilerTargetVM;
            private ConfigNodePropertyString _JasperCompilerSourceVM;
            private ConfigNodePropertyBoolean _JasperClassdebuginfo;
            private ConfigNodePropertyBoolean _JasperEnablePooling;
            private ConfigNodePropertyString _JasperIeClassId;
            private ConfigNodePropertyBoolean _JasperGenStringAsCharArray;
            private ConfigNodePropertyBoolean _JasperKeepgenerated;
            private ConfigNodePropertyBoolean _JasperMappedfile;
            private ConfigNodePropertyBoolean _JasperTrimSpaces;
            private ConfigNodePropertyBoolean _JasperDisplaySourceFragments;
            private ConfigNodePropertyBoolean _DefaultIsSession;

            internal OrgApacheSlingScriptingJspJspScriptEngineFactoryPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties.JasperCompilerTargetVM property.
            /// </summary>
            /// <param name="value">JasperCompilerTargetVM</param>
            public OrgApacheSlingScriptingJspJspScriptEngineFactoryPropertiesBuilder JasperCompilerTargetVM(ConfigNodePropertyString value)
            {
                _JasperCompilerTargetVM = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties.JasperCompilerSourceVM property.
            /// </summary>
            /// <param name="value">JasperCompilerSourceVM</param>
            public OrgApacheSlingScriptingJspJspScriptEngineFactoryPropertiesBuilder JasperCompilerSourceVM(ConfigNodePropertyString value)
            {
                _JasperCompilerSourceVM = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties.JasperClassdebuginfo property.
            /// </summary>
            /// <param name="value">JasperClassdebuginfo</param>
            public OrgApacheSlingScriptingJspJspScriptEngineFactoryPropertiesBuilder JasperClassdebuginfo(ConfigNodePropertyBoolean value)
            {
                _JasperClassdebuginfo = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties.JasperEnablePooling property.
            /// </summary>
            /// <param name="value">JasperEnablePooling</param>
            public OrgApacheSlingScriptingJspJspScriptEngineFactoryPropertiesBuilder JasperEnablePooling(ConfigNodePropertyBoolean value)
            {
                _JasperEnablePooling = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties.JasperIeClassId property.
            /// </summary>
            /// <param name="value">JasperIeClassId</param>
            public OrgApacheSlingScriptingJspJspScriptEngineFactoryPropertiesBuilder JasperIeClassId(ConfigNodePropertyString value)
            {
                _JasperIeClassId = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties.JasperGenStringAsCharArray property.
            /// </summary>
            /// <param name="value">JasperGenStringAsCharArray</param>
            public OrgApacheSlingScriptingJspJspScriptEngineFactoryPropertiesBuilder JasperGenStringAsCharArray(ConfigNodePropertyBoolean value)
            {
                _JasperGenStringAsCharArray = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties.JasperKeepgenerated property.
            /// </summary>
            /// <param name="value">JasperKeepgenerated</param>
            public OrgApacheSlingScriptingJspJspScriptEngineFactoryPropertiesBuilder JasperKeepgenerated(ConfigNodePropertyBoolean value)
            {
                _JasperKeepgenerated = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties.JasperMappedfile property.
            /// </summary>
            /// <param name="value">JasperMappedfile</param>
            public OrgApacheSlingScriptingJspJspScriptEngineFactoryPropertiesBuilder JasperMappedfile(ConfigNodePropertyBoolean value)
            {
                _JasperMappedfile = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties.JasperTrimSpaces property.
            /// </summary>
            /// <param name="value">JasperTrimSpaces</param>
            public OrgApacheSlingScriptingJspJspScriptEngineFactoryPropertiesBuilder JasperTrimSpaces(ConfigNodePropertyBoolean value)
            {
                _JasperTrimSpaces = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties.JasperDisplaySourceFragments property.
            /// </summary>
            /// <param name="value">JasperDisplaySourceFragments</param>
            public OrgApacheSlingScriptingJspJspScriptEngineFactoryPropertiesBuilder JasperDisplaySourceFragments(ConfigNodePropertyBoolean value)
            {
                _JasperDisplaySourceFragments = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties.DefaultIsSession property.
            /// </summary>
            /// <param name="value">DefaultIsSession</param>
            public OrgApacheSlingScriptingJspJspScriptEngineFactoryPropertiesBuilder DefaultIsSession(ConfigNodePropertyBoolean value)
            {
                _DefaultIsSession = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties.
            /// </summary>
            /// <returns>OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties</returns>
            public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties Build()
            {
                Validate();
                return new OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties(
                    JasperCompilerTargetVM: _JasperCompilerTargetVM,
                    JasperCompilerSourceVM: _JasperCompilerSourceVM,
                    JasperClassdebuginfo: _JasperClassdebuginfo,
                    JasperEnablePooling: _JasperEnablePooling,
                    JasperIeClassId: _JasperIeClassId,
                    JasperGenStringAsCharArray: _JasperGenStringAsCharArray,
                    JasperKeepgenerated: _JasperKeepgenerated,
                    JasperMappedfile: _JasperMappedfile,
                    JasperTrimSpaces: _JasperTrimSpaces,
                    JasperDisplaySourceFragments: _JasperDisplaySourceFragments,
                    DefaultIsSession: _DefaultIsSession
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}