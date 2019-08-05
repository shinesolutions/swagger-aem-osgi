using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqPollingImporterImplManagedPollingImporterImplInfo
    /// </summary>
    public sealed class ComDayCqPollingImporterImplManagedPollingImporterImplInfo:  IEquatable<ComDayCqPollingImporterImplManagedPollingImporterImplInfo>
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
        public ComDayCqPollingImporterImplManagedPollingImporterImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqPollingImporterImplManagedPollingImporterImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqPollingImporterImplManagedPollingImporterImplInfo()
        {
        }

        private ComDayCqPollingImporterImplManagedPollingImporterImplInfo(string Pid, string Title, string Description, ComDayCqPollingImporterImplManagedPollingImporterImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqPollingImporterImplManagedPollingImporterImplInfo.
        /// </summary>
        /// <returns>ComDayCqPollingImporterImplManagedPollingImporterImplInfoBuilder</returns>
        public static ComDayCqPollingImporterImplManagedPollingImporterImplInfoBuilder Builder()
        {
            return new ComDayCqPollingImporterImplManagedPollingImporterImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqPollingImporterImplManagedPollingImporterImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqPollingImporterImplManagedPollingImporterImplInfoBuilder</returns>
        public ComDayCqPollingImporterImplManagedPollingImporterImplInfoBuilder With()
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

        public bool Equals(ComDayCqPollingImporterImplManagedPollingImporterImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqPollingImporterImplManagedPollingImporterImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqPollingImporterImplManagedPollingImporterImplInfo</param>
        /// <param name="right">Compared (ComDayCqPollingImporterImplManagedPollingImporterImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqPollingImporterImplManagedPollingImporterImplInfo left, ComDayCqPollingImporterImplManagedPollingImporterImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqPollingImporterImplManagedPollingImporterImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqPollingImporterImplManagedPollingImporterImplInfo</param>
        /// <param name="right">Compared (ComDayCqPollingImporterImplManagedPollingImporterImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqPollingImporterImplManagedPollingImporterImplInfo left, ComDayCqPollingImporterImplManagedPollingImporterImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqPollingImporterImplManagedPollingImporterImplInfo.
        /// </summary>
        public sealed class ComDayCqPollingImporterImplManagedPollingImporterImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqPollingImporterImplManagedPollingImporterImplProperties _Properties;

            internal ComDayCqPollingImporterImplManagedPollingImporterImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqPollingImporterImplManagedPollingImporterImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqPollingImporterImplManagedPollingImporterImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqPollingImporterImplManagedPollingImporterImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqPollingImporterImplManagedPollingImporterImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqPollingImporterImplManagedPollingImporterImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqPollingImporterImplManagedPollingImporterImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqPollingImporterImplManagedPollingImporterImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqPollingImporterImplManagedPollingImporterImplInfoBuilder Properties(ComDayCqPollingImporterImplManagedPollingImporterImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqPollingImporterImplManagedPollingImporterImplInfo.
            /// </summary>
            /// <returns>ComDayCqPollingImporterImplManagedPollingImporterImplInfo</returns>
            public ComDayCqPollingImporterImplManagedPollingImporterImplInfo Build()
            {
                Validate();
                return new ComDayCqPollingImporterImplManagedPollingImporterImplInfo(
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