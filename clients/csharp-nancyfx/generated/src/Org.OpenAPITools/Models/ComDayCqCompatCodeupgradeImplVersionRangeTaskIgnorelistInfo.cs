using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo
    /// </summary>
    public sealed class ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo:  IEquatable<ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo>
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
        public ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo()
        {
        }

        private ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo(string Pid, string Title, string Description, ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo.
        /// </summary>
        /// <returns>ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfoBuilder</returns>
        public static ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfoBuilder Builder()
        {
            return new ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfoBuilder</returns>
        public ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfoBuilder With()
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

        public bool Equals(ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo</param>
        /// <param name="right">Compared (ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo left, ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo</param>
        /// <param name="right">Compared (ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo left, ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo.
        /// </summary>
        public sealed class ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties _Properties;

            internal ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfoBuilder Properties(ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo.
            /// </summary>
            /// <returns>ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo</returns>
            public ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo Build()
            {
                Validate();
                return new ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo(
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