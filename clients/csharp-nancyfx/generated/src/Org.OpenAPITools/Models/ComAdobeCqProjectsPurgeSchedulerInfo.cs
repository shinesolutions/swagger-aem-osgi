using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqProjectsPurgeSchedulerInfo
    /// </summary>
    public sealed class ComAdobeCqProjectsPurgeSchedulerInfo:  IEquatable<ComAdobeCqProjectsPurgeSchedulerInfo>
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
        public ComAdobeCqProjectsPurgeSchedulerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqProjectsPurgeSchedulerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqProjectsPurgeSchedulerInfo()
        {
        }

        private ComAdobeCqProjectsPurgeSchedulerInfo(string Pid, string Title, string Description, ComAdobeCqProjectsPurgeSchedulerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqProjectsPurgeSchedulerInfo.
        /// </summary>
        /// <returns>ComAdobeCqProjectsPurgeSchedulerInfoBuilder</returns>
        public static ComAdobeCqProjectsPurgeSchedulerInfoBuilder Builder()
        {
            return new ComAdobeCqProjectsPurgeSchedulerInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqProjectsPurgeSchedulerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqProjectsPurgeSchedulerInfoBuilder</returns>
        public ComAdobeCqProjectsPurgeSchedulerInfoBuilder With()
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

        public bool Equals(ComAdobeCqProjectsPurgeSchedulerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqProjectsPurgeSchedulerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqProjectsPurgeSchedulerInfo</param>
        /// <param name="right">Compared (ComAdobeCqProjectsPurgeSchedulerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqProjectsPurgeSchedulerInfo left, ComAdobeCqProjectsPurgeSchedulerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqProjectsPurgeSchedulerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqProjectsPurgeSchedulerInfo</param>
        /// <param name="right">Compared (ComAdobeCqProjectsPurgeSchedulerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqProjectsPurgeSchedulerInfo left, ComAdobeCqProjectsPurgeSchedulerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqProjectsPurgeSchedulerInfo.
        /// </summary>
        public sealed class ComAdobeCqProjectsPurgeSchedulerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqProjectsPurgeSchedulerProperties _Properties;

            internal ComAdobeCqProjectsPurgeSchedulerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqProjectsPurgeSchedulerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqProjectsPurgeSchedulerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqProjectsPurgeSchedulerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqProjectsPurgeSchedulerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqProjectsPurgeSchedulerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqProjectsPurgeSchedulerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqProjectsPurgeSchedulerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqProjectsPurgeSchedulerInfoBuilder Properties(ComAdobeCqProjectsPurgeSchedulerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqProjectsPurgeSchedulerInfo.
            /// </summary>
            /// <returns>ComAdobeCqProjectsPurgeSchedulerInfo</returns>
            public ComAdobeCqProjectsPurgeSchedulerInfo Build()
            {
                Validate();
                return new ComAdobeCqProjectsPurgeSchedulerInfo(
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