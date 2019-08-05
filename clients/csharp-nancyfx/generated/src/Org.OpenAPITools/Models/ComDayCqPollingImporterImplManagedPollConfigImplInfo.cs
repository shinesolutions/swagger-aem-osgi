using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqPollingImporterImplManagedPollConfigImplInfo
    /// </summary>
    public sealed class ComDayCqPollingImporterImplManagedPollConfigImplInfo:  IEquatable<ComDayCqPollingImporterImplManagedPollConfigImplInfo>
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
        public ComDayCqPollingImporterImplManagedPollConfigImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqPollingImporterImplManagedPollConfigImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqPollingImporterImplManagedPollConfigImplInfo()
        {
        }

        private ComDayCqPollingImporterImplManagedPollConfigImplInfo(string Pid, string Title, string Description, ComDayCqPollingImporterImplManagedPollConfigImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqPollingImporterImplManagedPollConfigImplInfo.
        /// </summary>
        /// <returns>ComDayCqPollingImporterImplManagedPollConfigImplInfoBuilder</returns>
        public static ComDayCqPollingImporterImplManagedPollConfigImplInfoBuilder Builder()
        {
            return new ComDayCqPollingImporterImplManagedPollConfigImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqPollingImporterImplManagedPollConfigImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqPollingImporterImplManagedPollConfigImplInfoBuilder</returns>
        public ComDayCqPollingImporterImplManagedPollConfigImplInfoBuilder With()
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

        public bool Equals(ComDayCqPollingImporterImplManagedPollConfigImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqPollingImporterImplManagedPollConfigImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqPollingImporterImplManagedPollConfigImplInfo</param>
        /// <param name="right">Compared (ComDayCqPollingImporterImplManagedPollConfigImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqPollingImporterImplManagedPollConfigImplInfo left, ComDayCqPollingImporterImplManagedPollConfigImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqPollingImporterImplManagedPollConfigImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqPollingImporterImplManagedPollConfigImplInfo</param>
        /// <param name="right">Compared (ComDayCqPollingImporterImplManagedPollConfigImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqPollingImporterImplManagedPollConfigImplInfo left, ComDayCqPollingImporterImplManagedPollConfigImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqPollingImporterImplManagedPollConfigImplInfo.
        /// </summary>
        public sealed class ComDayCqPollingImporterImplManagedPollConfigImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqPollingImporterImplManagedPollConfigImplProperties _Properties;

            internal ComDayCqPollingImporterImplManagedPollConfigImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqPollingImporterImplManagedPollConfigImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqPollingImporterImplManagedPollConfigImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqPollingImporterImplManagedPollConfigImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqPollingImporterImplManagedPollConfigImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqPollingImporterImplManagedPollConfigImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqPollingImporterImplManagedPollConfigImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqPollingImporterImplManagedPollConfigImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqPollingImporterImplManagedPollConfigImplInfoBuilder Properties(ComDayCqPollingImporterImplManagedPollConfigImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqPollingImporterImplManagedPollConfigImplInfo.
            /// </summary>
            /// <returns>ComDayCqPollingImporterImplManagedPollConfigImplInfo</returns>
            public ComDayCqPollingImporterImplManagedPollConfigImplInfo Build()
            {
                Validate();
                return new ComDayCqPollingImporterImplManagedPollConfigImplInfo(
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