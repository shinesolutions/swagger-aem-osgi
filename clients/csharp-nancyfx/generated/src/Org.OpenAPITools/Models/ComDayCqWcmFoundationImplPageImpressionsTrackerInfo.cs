using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmFoundationImplPageImpressionsTrackerInfo
    /// </summary>
    public sealed class ComDayCqWcmFoundationImplPageImpressionsTrackerInfo:  IEquatable<ComDayCqWcmFoundationImplPageImpressionsTrackerInfo>
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
        public ComDayCqWcmFoundationImplPageImpressionsTrackerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmFoundationImplPageImpressionsTrackerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmFoundationImplPageImpressionsTrackerInfo()
        {
        }

        private ComDayCqWcmFoundationImplPageImpressionsTrackerInfo(string Pid, string Title, string Description, ComDayCqWcmFoundationImplPageImpressionsTrackerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmFoundationImplPageImpressionsTrackerInfo.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationImplPageImpressionsTrackerInfoBuilder</returns>
        public static ComDayCqWcmFoundationImplPageImpressionsTrackerInfoBuilder Builder()
        {
            return new ComDayCqWcmFoundationImplPageImpressionsTrackerInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmFoundationImplPageImpressionsTrackerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationImplPageImpressionsTrackerInfoBuilder</returns>
        public ComDayCqWcmFoundationImplPageImpressionsTrackerInfoBuilder With()
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

        public bool Equals(ComDayCqWcmFoundationImplPageImpressionsTrackerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmFoundationImplPageImpressionsTrackerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationImplPageImpressionsTrackerInfo</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationImplPageImpressionsTrackerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmFoundationImplPageImpressionsTrackerInfo left, ComDayCqWcmFoundationImplPageImpressionsTrackerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmFoundationImplPageImpressionsTrackerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationImplPageImpressionsTrackerInfo</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationImplPageImpressionsTrackerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmFoundationImplPageImpressionsTrackerInfo left, ComDayCqWcmFoundationImplPageImpressionsTrackerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmFoundationImplPageImpressionsTrackerInfo.
        /// </summary>
        public sealed class ComDayCqWcmFoundationImplPageImpressionsTrackerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmFoundationImplPageImpressionsTrackerProperties _Properties;

            internal ComDayCqWcmFoundationImplPageImpressionsTrackerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationImplPageImpressionsTrackerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmFoundationImplPageImpressionsTrackerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationImplPageImpressionsTrackerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmFoundationImplPageImpressionsTrackerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationImplPageImpressionsTrackerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmFoundationImplPageImpressionsTrackerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationImplPageImpressionsTrackerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmFoundationImplPageImpressionsTrackerInfoBuilder Properties(ComDayCqWcmFoundationImplPageImpressionsTrackerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmFoundationImplPageImpressionsTrackerInfo.
            /// </summary>
            /// <returns>ComDayCqWcmFoundationImplPageImpressionsTrackerInfo</returns>
            public ComDayCqWcmFoundationImplPageImpressionsTrackerInfo Build()
            {
                Validate();
                return new ComDayCqWcmFoundationImplPageImpressionsTrackerInfo(
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