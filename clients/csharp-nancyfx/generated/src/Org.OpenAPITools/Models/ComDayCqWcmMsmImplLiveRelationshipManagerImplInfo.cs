using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo
    /// </summary>
    public sealed class ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo:  IEquatable<ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo>
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
        public ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo()
        {
        }

        private ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo(string Pid, string Title, string Description, ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo.
        /// </summary>
        /// <returns>ComDayCqWcmMsmImplLiveRelationshipManagerImplInfoBuilder</returns>
        public static ComDayCqWcmMsmImplLiveRelationshipManagerImplInfoBuilder Builder()
        {
            return new ComDayCqWcmMsmImplLiveRelationshipManagerImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmMsmImplLiveRelationshipManagerImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmMsmImplLiveRelationshipManagerImplInfoBuilder</returns>
        public ComDayCqWcmMsmImplLiveRelationshipManagerImplInfoBuilder With()
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

        public bool Equals(ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo</param>
        /// <param name="right">Compared (ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo left, ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo</param>
        /// <param name="right">Compared (ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo left, ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo.
        /// </summary>
        public sealed class ComDayCqWcmMsmImplLiveRelationshipManagerImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties _Properties;

            internal ComDayCqWcmMsmImplLiveRelationshipManagerImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmMsmImplLiveRelationshipManagerImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmMsmImplLiveRelationshipManagerImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmMsmImplLiveRelationshipManagerImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmMsmImplLiveRelationshipManagerImplInfoBuilder Properties(ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo.
            /// </summary>
            /// <returns>ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo</returns>
            public ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo Build()
            {
                Validate();
                return new ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo(
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