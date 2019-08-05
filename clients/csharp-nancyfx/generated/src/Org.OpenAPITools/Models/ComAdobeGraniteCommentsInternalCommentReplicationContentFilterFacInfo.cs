using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo
    /// </summary>
    public sealed class ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo:  IEquatable<ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo>
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
        public ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo()
        {
        }

        private ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo(string Pid, string Title, string Description, ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoBuilder</returns>
        public static ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoBuilder Builder()
        {
            return new ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoBuilder</returns>
        public ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo left, ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo left, ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo.
        /// </summary>
        public sealed class ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties _Properties;

            internal ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoBuilder Properties(ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo</returns>
            public ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo Build()
            {
                Validate();
                return new ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo(
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