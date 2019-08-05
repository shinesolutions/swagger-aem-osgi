using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqReplicationImplAgentManagerImplInfo
    /// </summary>
    public sealed class ComDayCqReplicationImplAgentManagerImplInfo:  IEquatable<ComDayCqReplicationImplAgentManagerImplInfo>
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
        public ComDayCqReplicationImplAgentManagerImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqReplicationImplAgentManagerImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqReplicationImplAgentManagerImplInfo()
        {
        }

        private ComDayCqReplicationImplAgentManagerImplInfo(string Pid, string Title, string Description, ComDayCqReplicationImplAgentManagerImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqReplicationImplAgentManagerImplInfo.
        /// </summary>
        /// <returns>ComDayCqReplicationImplAgentManagerImplInfoBuilder</returns>
        public static ComDayCqReplicationImplAgentManagerImplInfoBuilder Builder()
        {
            return new ComDayCqReplicationImplAgentManagerImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqReplicationImplAgentManagerImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqReplicationImplAgentManagerImplInfoBuilder</returns>
        public ComDayCqReplicationImplAgentManagerImplInfoBuilder With()
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

        public bool Equals(ComDayCqReplicationImplAgentManagerImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqReplicationImplAgentManagerImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationImplAgentManagerImplInfo</param>
        /// <param name="right">Compared (ComDayCqReplicationImplAgentManagerImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqReplicationImplAgentManagerImplInfo left, ComDayCqReplicationImplAgentManagerImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqReplicationImplAgentManagerImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationImplAgentManagerImplInfo</param>
        /// <param name="right">Compared (ComDayCqReplicationImplAgentManagerImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqReplicationImplAgentManagerImplInfo left, ComDayCqReplicationImplAgentManagerImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqReplicationImplAgentManagerImplInfo.
        /// </summary>
        public sealed class ComDayCqReplicationImplAgentManagerImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqReplicationImplAgentManagerImplProperties _Properties;

            internal ComDayCqReplicationImplAgentManagerImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplAgentManagerImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqReplicationImplAgentManagerImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplAgentManagerImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqReplicationImplAgentManagerImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplAgentManagerImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqReplicationImplAgentManagerImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplAgentManagerImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqReplicationImplAgentManagerImplInfoBuilder Properties(ComDayCqReplicationImplAgentManagerImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqReplicationImplAgentManagerImplInfo.
            /// </summary>
            /// <returns>ComDayCqReplicationImplAgentManagerImplInfo</returns>
            public ComDayCqReplicationImplAgentManagerImplInfo Build()
            {
                Validate();
                return new ComDayCqReplicationImplAgentManagerImplInfo(
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