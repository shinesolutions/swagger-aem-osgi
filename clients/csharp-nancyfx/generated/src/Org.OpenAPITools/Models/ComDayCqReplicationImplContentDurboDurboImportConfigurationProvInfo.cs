using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo
    /// </summary>
    public sealed class ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo:  IEquatable<ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo>
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
        public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo()
        {
        }

        private ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo(string Pid, string Title, string Description, ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo.
        /// </summary>
        /// <returns>ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfoBuilder</returns>
        public static ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfoBuilder Builder()
        {
            return new ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfoBuilder</returns>
        public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfoBuilder With()
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

        public bool Equals(ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo</param>
        /// <param name="right">Compared (ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo left, ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo</param>
        /// <param name="right">Compared (ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo left, ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo.
        /// </summary>
        public sealed class ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties _Properties;

            internal ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfoBuilder Properties(ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo.
            /// </summary>
            /// <returns>ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo</returns>
            public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo Build()
            {
                Validate();
                return new ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo(
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