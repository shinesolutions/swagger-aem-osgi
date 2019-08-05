using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqPollingImporterImplPollingImporterImplInfo
    /// </summary>
    public sealed class ComDayCqPollingImporterImplPollingImporterImplInfo:  IEquatable<ComDayCqPollingImporterImplPollingImporterImplInfo>
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
        public ComDayCqPollingImporterImplPollingImporterImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqPollingImporterImplPollingImporterImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqPollingImporterImplPollingImporterImplInfo()
        {
        }

        private ComDayCqPollingImporterImplPollingImporterImplInfo(string Pid, string Title, string Description, ComDayCqPollingImporterImplPollingImporterImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqPollingImporterImplPollingImporterImplInfo.
        /// </summary>
        /// <returns>ComDayCqPollingImporterImplPollingImporterImplInfoBuilder</returns>
        public static ComDayCqPollingImporterImplPollingImporterImplInfoBuilder Builder()
        {
            return new ComDayCqPollingImporterImplPollingImporterImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqPollingImporterImplPollingImporterImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqPollingImporterImplPollingImporterImplInfoBuilder</returns>
        public ComDayCqPollingImporterImplPollingImporterImplInfoBuilder With()
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

        public bool Equals(ComDayCqPollingImporterImplPollingImporterImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqPollingImporterImplPollingImporterImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqPollingImporterImplPollingImporterImplInfo</param>
        /// <param name="right">Compared (ComDayCqPollingImporterImplPollingImporterImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqPollingImporterImplPollingImporterImplInfo left, ComDayCqPollingImporterImplPollingImporterImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqPollingImporterImplPollingImporterImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqPollingImporterImplPollingImporterImplInfo</param>
        /// <param name="right">Compared (ComDayCqPollingImporterImplPollingImporterImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqPollingImporterImplPollingImporterImplInfo left, ComDayCqPollingImporterImplPollingImporterImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqPollingImporterImplPollingImporterImplInfo.
        /// </summary>
        public sealed class ComDayCqPollingImporterImplPollingImporterImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqPollingImporterImplPollingImporterImplProperties _Properties;

            internal ComDayCqPollingImporterImplPollingImporterImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqPollingImporterImplPollingImporterImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqPollingImporterImplPollingImporterImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqPollingImporterImplPollingImporterImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqPollingImporterImplPollingImporterImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqPollingImporterImplPollingImporterImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqPollingImporterImplPollingImporterImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqPollingImporterImplPollingImporterImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqPollingImporterImplPollingImporterImplInfoBuilder Properties(ComDayCqPollingImporterImplPollingImporterImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqPollingImporterImplPollingImporterImplInfo.
            /// </summary>
            /// <returns>ComDayCqPollingImporterImplPollingImporterImplInfo</returns>
            public ComDayCqPollingImporterImplPollingImporterImplInfo Build()
            {
                Validate();
                return new ComDayCqPollingImporterImplPollingImporterImplInfo(
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