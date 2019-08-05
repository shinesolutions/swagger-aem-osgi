using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo
    /// </summary>
    public sealed class OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo:  IEquatable<OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo>
    { 
        /// <summary>
        /// Pid
        /// </summary>
        public string Pid { get; private set; }

        /// <summary>
        /// Title
        /// </summary>
        public string Title { get; private set; }

        /// <summary>
        /// Description
        /// </summary>
        public string Description { get; private set; }

        /// <summary>
        /// Properties
        /// </summary>
        public OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo()
        {
        }

        private OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo(string Pid, string Title, string Description, OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo.
        /// </summary>
        /// <returns>OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfoBuilder</returns>
        public static OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfoBuilder Builder()
        {
            return new OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfoBuilder</returns>
        public OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfoBuilder With()
        {
            return Builder()
                .Pid(Pid)
                .Title(Title)
                .Description(Description)
                .Properties(Properties);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo</param>
        /// <param name="right">Compared (OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo left, OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo</param>
        /// <param name="right">Compared (OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo left, OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo.
        /// </summary>
        public sealed class OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties _Properties;

            internal OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfoBuilder Properties(OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo.
            /// </summary>
            /// <returns>OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo</returns>
            public OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo Build()
            {
                Validate();
                return new OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo(
                    Pid: _Pid,
                    Title: _Title,
                    Description: _Description,
                    Properties: _Properties
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}