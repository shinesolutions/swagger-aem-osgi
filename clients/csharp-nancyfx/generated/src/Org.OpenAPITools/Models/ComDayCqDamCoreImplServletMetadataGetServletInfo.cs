using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplServletMetadataGetServletInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplServletMetadataGetServletInfo:  IEquatable<ComDayCqDamCoreImplServletMetadataGetServletInfo>
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
        public ComDayCqDamCoreImplServletMetadataGetServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplServletMetadataGetServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplServletMetadataGetServletInfo()
        {
        }

        private ComDayCqDamCoreImplServletMetadataGetServletInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplServletMetadataGetServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplServletMetadataGetServletInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletMetadataGetServletInfoBuilder</returns>
        public static ComDayCqDamCoreImplServletMetadataGetServletInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplServletMetadataGetServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplServletMetadataGetServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletMetadataGetServletInfoBuilder</returns>
        public ComDayCqDamCoreImplServletMetadataGetServletInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplServletMetadataGetServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplServletMetadataGetServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletMetadataGetServletInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletMetadataGetServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplServletMetadataGetServletInfo left, ComDayCqDamCoreImplServletMetadataGetServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplServletMetadataGetServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletMetadataGetServletInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletMetadataGetServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplServletMetadataGetServletInfo left, ComDayCqDamCoreImplServletMetadataGetServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplServletMetadataGetServletInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplServletMetadataGetServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplServletMetadataGetServletProperties _Properties;

            internal ComDayCqDamCoreImplServletMetadataGetServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletMetadataGetServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplServletMetadataGetServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletMetadataGetServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplServletMetadataGetServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletMetadataGetServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplServletMetadataGetServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletMetadataGetServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplServletMetadataGetServletInfoBuilder Properties(ComDayCqDamCoreImplServletMetadataGetServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplServletMetadataGetServletInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplServletMetadataGetServletInfo</returns>
            public ComDayCqDamCoreImplServletMetadataGetServletInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplServletMetadataGetServletInfo(
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