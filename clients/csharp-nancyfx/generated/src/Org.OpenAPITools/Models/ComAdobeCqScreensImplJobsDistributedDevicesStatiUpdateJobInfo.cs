using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo
    /// </summary>
    public sealed class ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo:  IEquatable<ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo>
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
        public ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo()
        {
        }

        private ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo(string Pid, string Title, string Description, ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo.
        /// </summary>
        /// <returns>ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoBuilder</returns>
        public static ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoBuilder Builder()
        {
            return new ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoBuilder</returns>
        public ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoBuilder With()
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

        public bool Equals(ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo</param>
        /// <param name="right">Compared (ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo left, ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo</param>
        /// <param name="right">Compared (ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo left, ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo.
        /// </summary>
        public sealed class ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties _Properties;

            internal ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoBuilder Properties(ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo.
            /// </summary>
            /// <returns>ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo</returns>
            public ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo Build()
            {
                Validate();
                return new ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo(
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