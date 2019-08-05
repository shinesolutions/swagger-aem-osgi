using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo
    /// </summary>
    public sealed class ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo:  IEquatable<ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo>
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
        public ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo()
        {
        }

        private ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo(string Pid, string Title, string Description, ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo.
        /// </summary>
        /// <returns>ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfoBuilder</returns>
        public static ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfoBuilder Builder()
        {
            return new ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfoBuilder</returns>
        public ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfoBuilder With()
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

        public bool Equals(ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo left, ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo left, ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo.
        /// </summary>
        public sealed class ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties _Properties;

            internal ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfoBuilder Properties(ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo.
            /// </summary>
            /// <returns>ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo</returns>
            public ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo Build()
            {
                Validate();
                return new ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo(
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